package com.net.samupra.macros.caseclasschecker

import scala.language.experimental.macros
import scala.reflect.macros.blackbox

object CaseClassChecker {

  def impl[T : c.WeakTypeTag](c : blackbox.Context) = {
    import c.universe._
    val symbol = c.symbolOf[T]
    symbol.asClass.isCaseClass match {
      case false => c.abort(c.enclosingPosition, s"${symbol.fullName} must be a case class")
      case true => c.Expr(Literal(Constant(true)))
    }
  }

  def check[T] : Boolean = macro impl[T]

}

