package domain

import play.api.libs.json.Json

/**
 * Created by root on 2015/08/11.
 */
case class TwitterData (val name:String, val comment:List[String])

object TwitterData{
  implicit lazy val twitterdatafmt = Json.format[TwitterData]
}