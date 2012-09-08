/* ************************************************************** *
 *                                                                *
 * Copyright (c) 2005-2012, Kota Mizushima, All rights reserved.  *
 *                                                                *
 *                                                                *
 * This software is distributed under the modified BSD License.   *
 * ************************************************************** */
package onion.compiler.toolbox

import java.text.MessageFormat
import java.util.ResourceBundle

/**
 * @author Kota Mizushima
 * Date: 2005/06/17
 */
object Messages {
  private val ERROR_MESSAGES: ResourceBundle = ResourceBundle.getBundle("errorMessage")

  def get(property: String): String =  ERROR_MESSAGES.getString(property)

  def get(property: String, arguments: Array[Any]): String =  MessageFormat.format(get(property), arguments.map(_.asInstanceOf[AnyRef]):_*)

  def get(property: String, arg1: Any): String = MessageFormat.format(get(property), arg1.asInstanceOf[AnyRef])

  def get(property: String, arg1: Any, arg2: AnyRef): String =  MessageFormat.format(get(property), arg1.asInstanceOf[AnyRef], arg2)

  def get(property: String, arg1: Any, arg2: AnyRef, arg3: AnyRef): String =  MessageFormat.format(get(property), arg1.asInstanceOf[AnyRef] ,arg2, arg3)
}
