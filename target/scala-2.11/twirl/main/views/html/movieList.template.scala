
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

object movieList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.movie.Movie],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(movies: List[models.movie.Movie]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<script src=""""),_display_(/*2.15*/routes/*2.21*/.Assets.versioned("javascripts/moviePage.js")),format.raw/*2.66*/("""" type="text/javascript"></script>

"""),_display_(/*4.2*/main("Movie")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""

    """),_display_(/*6.6*/for(movie <- movies) yield /*6.26*/{_display_(Seq[Any](format.raw/*6.27*/("""

        """),format.raw/*8.9*/("""<a href=""""),_display_(/*8.19*/routes/*8.25*/.HomeController.moviePage(movie.getId)),format.raw/*8.63*/(""""> """),_display_(/*8.67*/movie/*8.72*/.getTitle),format.raw/*8.81*/(""" """),format.raw/*8.82*/("""<a> 

        <br>
    """)))}),format.raw/*11.6*/("""


""")))}),format.raw/*14.2*/("""
  """))
      }
    }
  }

  def render(movies:List[models.movie.Movie]): play.twirl.api.HtmlFormat.Appendable = apply(movies)

  def f:((List[models.movie.Movie]) => play.twirl.api.HtmlFormat.Appendable) = (movies) => apply(movies)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Jul 30 15:00:40 IST 2019
                  SOURCE: /home/ktennyson/Documents/pacticeFiles/whattowatch/app/views/movieList.scala.html
                  HASH: be1d8937d0f57cfab0843b02c4d05c26cf8ab0ab
                  MATRIX: 970->1|1098->36|1138->50|1152->56|1217->101|1279->138|1300->151|1339->153|1371->160|1406->180|1444->181|1480->191|1516->201|1530->207|1588->245|1618->249|1631->254|1660->263|1688->264|1742->288|1776->292
                  LINES: 28->1|33->2|33->2|33->2|33->2|35->4|35->4|35->4|37->6|37->6|37->6|39->8|39->8|39->8|39->8|39->8|39->8|39->8|39->8|42->11|45->14
                  -- GENERATED --
              */
          