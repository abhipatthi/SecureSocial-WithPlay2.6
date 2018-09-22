// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Development/SecureSocial-WithPlay2.6/conf/routes
// @DATE:Fri Sep 21 21:34:58 EDT 2018


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
