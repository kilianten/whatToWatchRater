
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

object moviePage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.movie.Movie,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(movie: models.movie.Movie):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<script src=""""),_display_(/*2.15*/routes/*2.21*/.Assets.versioned("javascripts/moviePage.js")),format.raw/*2.66*/("""" type="text/javascript"></script>
<link rel="stylesheet" media="screen" href=""""),_display_(/*3.46*/routes/*3.52*/.Assets.versioned("stylesheets/moviePage.css")),format.raw/*3.98*/("""">


"""),_display_(/*6.2*/main("Movie")/*6.15*/ {_display_(Seq[Any](format.raw/*6.17*/("""


    """),format.raw/*9.5*/("""<div id="main"> 

    <img id="bannerImage" class="mask1" src='/assets/images/movies/movieBanners/"""),_display_(/*11.82*/movie/*11.87*/.getId),format.raw/*11.93*/("""-Banner.jpg'>
    <h1 id="movieTitle">"""),_display_(/*12.26*/movie/*12.31*/.getTitle),format.raw/*12.40*/("""</h1>

        <img id="moviePoster" onload="changeBackground('"""),_display_(/*14.58*/movie/*14.63*/.getBackgroundColour),format.raw/*14.83*/("""')" src="/assets/"""),_display_(/*14.101*/movie/*14.106*/.getMoviePoster),format.raw/*14.121*/("""">
        
        <br>
        <hr>
        <h3>Release Date: """),_display_(/*18.28*/movie/*18.33*/.getReleaseDate),format.raw/*18.48*/("""</h3>

        <h2>"""),_display_(/*20.14*/movie/*20.19*/.getMovieRating.getTotal),format.raw/*20.43*/("""</h2>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>

        <div id="colour-select-container">
            """),_display_(/*47.14*/for(colour <- movie.generateColours(10)) yield /*47.54*/{_display_(Seq[Any](format.raw/*47.55*/("""
            
            """),format.raw/*49.13*/("""<a href=""""),_display_(/*49.23*/routes/*49.29*/.HomeController.changeMovieColour(movie.getId, colour)),format.raw/*49.83*/("""">
                <div id="colour-select" onClick="changeBackground()"  style="background-color:"""),_display_(/*50.96*/colour),format.raw/*50.102*/(""";">
                </div>
            </a>

            """)))}),format.raw/*54.14*/("""
        """),format.raw/*55.9*/("""</div> <!--Div for color select container-->    
    
    <br>

    </div> <!---  Main Div  ---->
""")))}),format.raw/*60.2*/("""
  """))
      }
    }
  }

  def render(movie:models.movie.Movie): play.twirl.api.HtmlFormat.Appendable = apply(movie)

  def f:((models.movie.Movie) => play.twirl.api.HtmlFormat.Appendable) = (movie) => apply(movie)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Jul 31 17:01:23 IST 2019
                  SOURCE: /home/ktennyson/Documents/pacticeFiles/whattowatch/app/views/moviePage.scala.html
                  HASH: cb730c625a3e3e723d597a7e03391e7f5ad32729
                  MATRIX: 964->1|1085->29|1125->43|1139->49|1204->94|1310->174|1324->180|1390->226|1421->232|1442->245|1481->247|1514->254|1640->353|1654->358|1681->364|1747->403|1761->408|1791->417|1882->481|1896->486|1937->506|1983->524|1998->529|2035->544|2127->609|2141->614|2177->629|2224->649|2238->654|2283->678|2685->1053|2741->1093|2780->1094|2834->1120|2871->1130|2886->1136|2961->1190|3086->1288|3114->1294|3203->1352|3239->1361|3368->1460
                  LINES: 28->1|33->2|33->2|33->2|33->2|34->3|34->3|34->3|37->6|37->6|37->6|40->9|42->11|42->11|42->11|43->12|43->12|43->12|45->14|45->14|45->14|45->14|45->14|45->14|49->18|49->18|49->18|51->20|51->20|51->20|78->47|78->47|78->47|80->49|80->49|80->49|80->49|81->50|81->50|85->54|86->55|91->60
                  -- GENERATED --
              */
          