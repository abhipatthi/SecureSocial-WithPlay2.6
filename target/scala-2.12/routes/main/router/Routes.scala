// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Development/SecureSocial-WithPlay2.6/conf/routes
// @DATE:Fri Sep 21 21:34:58 EDT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: javax.inject.Provider[controllers.Application],
  // @LINE:10
  Assets_0: controllers.Assets,
  // @LINE:11
  securesocial_Routes_0: securesocial.Routes,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: javax.inject.Provider[controllers.Application],
    // @LINE:10
    Assets_0: controllers.Assets,
    // @LINE:11
    securesocial_Routes_0: securesocial.Routes
  ) = this(errorHandler, Application_1, Assets_0, securesocial_Routes_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, securesocial_Routes_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """@controllers.Application@.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    prefixed_securesocial_Routes_0_2.router.documentation,
    prefixed_securesocial_Routes_0_3.router.documentation,
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.get.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_at1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:11
  private[this] val prefixed_securesocial_Routes_0_2 = Include(securesocial_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "auth"))

  // @LINE:12
  private[this] val prefixed_securesocial_Routes_0_3 = Include(securesocial_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "authenticate/github"))


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params@_) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.get.index)
      }
  
    // @LINE:10
    case controllers_Assets_at1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:11
    case prefixed_securesocial_Routes_0_2(handler) => handler
  
    // @LINE:12
    case prefixed_securesocial_Routes_0_3(handler) => handler
  }
}
