import akka.actor.ActorSystem
import com.sun.deploy.net.{HttpResponse, HttpRequest}
import spray.http._
import spray.client.pipelining._

import scala.concurrent.Future

implicit val system = ActorSystem()
import system.dispatcher // execution context for futures

val pipeline: HttpRequest => Future[HttpResponse] = sendReceive

val response: Future[HttpResponse] = pipeline(Get("http://spray.io/"))