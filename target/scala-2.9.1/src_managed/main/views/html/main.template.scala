
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Scala """),_display_(Seq(/*7.23*/title)),format.raw/*7.28*/("""</title>
        <link rel="stylesheet" media="screen" href='"""),_display_(Seq(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*8.103*/("""'>
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq(/*9.48*/routes/*9.54*/.Assets.at("stylesheets/main.css"))),format.raw/*9.88*/("""">
		<link rel="stylesheet" media="screen" href='"""),_display_(Seq(/*10.48*/routes/*10.54*/.Assets.at("stylesheets/bootstrap-responsive.min.css"))),format.raw/*10.108*/("""'>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq(/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <script src=""""),_display_(Seq(/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*12.74*/("""" type="text/javascript"></script>
    </head>
    <body>
    <header>
    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
		  <a class="brand" href="#">すからちゃっと</a>
        </div>
      </div>
    </div>
	</header>
		<div class="container">
        """),_display_(Seq(/*25.10*/content)),format.raw/*25.17*/("""
		</div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 19 11:36:24 JST 2012
                    SOURCE: /Users/saito_hirokazu/Documents/workspace/blooming-galaxy-3087/app/views/main.scala.html
                    HASH: fabf5f2da8af73ef67ba5fb4f4e7eac72f1fcd9f
                    MATRIX: 509->1|611->31|700->90|726->95|818->157|832->163|897->206|977->256|991->262|1046->296|1127->346|1142->352|1219->406|1311->467|1326->473|1380->505|1436->530|1451->536|1518->581|1854->886|1883->893
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|46->25|46->25
                    -- GENERATED --
                */
            