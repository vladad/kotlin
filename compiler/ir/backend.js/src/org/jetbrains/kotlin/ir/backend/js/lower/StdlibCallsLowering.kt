/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.backend.js.lower

import org.jetbrains.kotlin.backend.common.FileLoweringPass
import org.jetbrains.kotlin.ir.backend.js.JsIrBackendContext
import org.jetbrains.kotlin.ir.declarations.IrFile
import org.jetbrains.kotlin.ir.declarations.IrFunction
import org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl
import org.jetbrains.kotlin.ir.expressions.IrCall
import org.jetbrains.kotlin.ir.expressions.IrExpression
import org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl
import org.jetbrains.kotlin.ir.util.dump
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid

class StdlibCallsLowering(private val context: JsIrBackendContext) : FileLoweringPass {

    private fun getInternalFunction(name: String) = context.symbolTable.referenceSimpleFunction(context.getInternalFunctions(name).single())

    private val anyHashCode = getInternalFunction("hashCode")

    override fun lower(irFile: IrFile) {
        irFile.transform(object : IrElementTransformerVoid() {
            override fun visitCall(expression: IrCall): IrExpression {
                val call = super.visitCall(expression)
                if (call !is IrCall) return call

                val symbol = call.symbol
                if (!symbol.isBound) return call

                val function = symbol.owner
                if (function.dispatchReceiverParameter == null) return call

                if (function.name.asString() == "hashCode") {
                    return irCall(call, anyHashCode, true)
                }

                return call
            }
        }, null)
    }
}