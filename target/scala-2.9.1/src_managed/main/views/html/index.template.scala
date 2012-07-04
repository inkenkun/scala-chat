
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.17*/("""

"""),_display_(Seq(/*3.2*/main(title)/*3.13*/ {_display_(Seq(format.raw/*3.15*/("""	
    <div class="row">
	<div class="span12">
	<textarea class="span12" id="textarea" rows="14"></textarea>
	
	<form method="POST" action="/speak" class="form-horizontal">
    	<div class="input-append">
		<input class="span4" id="appendedInputButton" size="100" type="text" name="msg"><button class="btn" type="submit">speak &lt;</button>
		</div>    
	</form>
    </div>
	</div>
""")))})),format.raw/*15.2*/("""

"""))}
    }
    
    def render(title:String) = apply(title)
    
    def f:((String) => play.api.templates.Html) = (title) => apply(title)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 19 16:11:17 JST 2012
                    SOURCE: /Users/saito_hirokazu/Documents/workspace/blooming-galaxy-3087/app/views/index.scala.html
                    HASH: ea6db0784716af44c7f8dea13ac4734a35d4745b
                    MATRIX: 505->1|592->16|624->19|643->30|677->32|1090->414
                    LINES: 19->1|22->1|24->3|24->3|24->3|36->15
                    -- GENERATED --
                */
            