// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ktennyson/Documents/pacticeFiles/whattowatch/conf/routes
// @DATE:Tue Jul 30 11:09:39 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
