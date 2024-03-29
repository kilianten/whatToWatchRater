// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ktennyson/Documents/pacticeFiles/whattowatch/conf/routes
// @DATE:Tue Aug 13 11:46:03 IST 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def movieList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.movieList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movieList"})
        }
      """
    )
  
    // @LINE:10
    def rateMovie: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.rateMovie",
      """
        function(rating0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rateMovie/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("rating", rating0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id1))})
        }
      """
    )
  
    // @LINE:13
    def changeMovieColour: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.changeMovieColour",
      """
        function(id0,colour1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "changeMovieColour/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("colour", colour1))})
        }
      """
    )
  
    // @LINE:7
    def moviePage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.moviePage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movie/id" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
