/* ************************************************************** *
 *                                                                *
 * Copyright (c) 2005, Kota Mizushima, All rights reserved.       *
 *                                                                *
 *                                                                *
 * This software is distributed under the modified BSD License.   *
 * ************************************************************** */
package onion.tools.option

/**
 * @author Kota Mizushima
 *         Date: 2005/04/08
 */
class OptionConf(optionName: String, val hasArgument_ : Boolean) {
  def getOptionName: String = {
    return optionName
  }

  def hasArgument: Boolean = {
    return hasArgument_
  }
}