// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ktennyson/Documents/pacticeFiles/whattowatch/conf/routes
// @DATE:Tue Jul 30 14:52:00 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:15
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:15
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movie/id""", """controllers.HomeController.moviePage(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movieList""", """controllers.HomeController.movieList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """changeMovieColour/""" + "$" + """id<[^/]+>/""" + "$" + """colour<[^/]+>""", """controllers.HomeController.changeMovieColour(id:Long, colour:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_moviePage1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movie/id")))
  )
  private[this] lazy val controllers_HomeController_moviePage1_invoker = createInvoker(
    HomeController_1.moviePage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "moviePage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """movie/id""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_movieList2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movieList")))
  )
  private[this] lazy val controllers_HomeController_movieList2_invoker = createInvoker(
    HomeController_1.movieList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "movieList",
      Nil,
      "GET",
      this.prefix + """movieList""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_changeMovieColour3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("changeMovieColour/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("colour", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_changeMovieColour3_invoker = createInvoker(
    HomeController_1.changeMovieColour(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "changeMovieColour",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """changeMovieColour/""" + "$" + """id<[^/]+>/""" + "$" + """colour<[^/]+>""",
      """Moveie Colours""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:7
    case controllers_HomeController_moviePage1_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_HomeController_moviePage1_invoker.call(HomeController_1.moviePage(id))
      }
  
    // @LINE:8
    case controllers_HomeController_movieList2_route(params@_) =>
      call { 
        controllers_HomeController_movieList2_invoker.call(HomeController_1.movieList)
      }
  
    // @LINE:11
    case controllers_HomeController_changeMovieColour3_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("colour", None)) { (id, colour) =>
        controllers_HomeController_changeMovieColour3_invoker.call(HomeController_1.changeMovieColour(id, colour))
      }
  
    // @LINE:15
    case controllers_Assets_versioned4_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
