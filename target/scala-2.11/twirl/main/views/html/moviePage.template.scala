
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object moviePage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""main("Movie") """),format.raw/*3.15*/("""{"""),format.raw/*3.16*/("""
    """),format.raw/*4.5*/("""<h1>Welcome to Play!</h1>
"""),format.raw/*5.1*/("""}"""),format.raw/*5.2*/("""
  """))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jul 24 10:38:31 IST 2019
                  SOURCE: /home/ktennyson/Documents/pacticeFiles/whattowatch/app/views/moviePage.scala.html
                  HASH: 039a027d1fa4412aa0ef0306c14feafd72b83c03
                  MATRIX: 945->1|1041->4|1068->5|1109->19|1137->20|1168->25|1220->51|1247->52
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|36->5|36->5
                  -- GENERATED --
              */
          