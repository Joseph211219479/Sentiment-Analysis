package domain

import play.api.libs.json.Json

/**
 * Created by root on 2015/08/01.
 */
case class Facebook (val name:String, val comment:List[String])

object Facebook{
  implicit lazy val facebookfmt = Json.format[Facebook]
}