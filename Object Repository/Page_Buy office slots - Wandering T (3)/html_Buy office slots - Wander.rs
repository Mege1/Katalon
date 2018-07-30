<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_Buy office slots - Wander</name>
   <tag></tag>
   <elementGuidId>a967e276-3886-4de6-9ea8-8a4a1a3c1e97</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value> js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
    
    Buy office slots - Wandering Tail Oy
    

    

    
        var appInsights=window.appInsights||function(config)
        {
            function r(config){ t[config] = function(){ var i = arguments; t.queue.push(function(){ t[config].apply(t, i)})} }
            var t = { config:config},u=document,e=window,o='script',s=u.createElement(o),i,f;for(s.src=config.url||'//az416426.vo.msecnd.net/scripts/a/ai.0.js',u.getElementsByTagName(o)[0].parentNode.appendChild(s),t.cookie=u.cookie,t.queue=[],i=['Event','Exception','Metric','PageView','Trace','Ajax'];i.length;)r('track'+i.pop());return r('setAuthenticatedUserContext'),r('clearAuthenticatedUserContext'),config.disableExceptionTracking||(i='onerror',r('_'+i),f=e[i],e[i]=function(config, r, u, e, o) { var s = f &amp;&amp; f(config, r, u, e, o); return s !== !0 &amp;&amp; t['_' + i](config, r, u, e, o),s}),t
        }({
            instrumentationKey:'72b84b75-a437-4555-9a37-fcd4200988b3'
        });
        
        window.appInsights=appInsights;
        appInsights.trackPageView();
    
#katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}

        
            
                
                    
                        
                        
                        
                    
                    Wandering Tail
                
                
                    
                        Ads
                        Offices
                        WT-credits
                    
                        
        
            My account
        
        Log off
    

                
            
        
    
        
        


 

    
        
            
                
                    1 more office
                
                
                    
                        1000 WT -credits
                    
                
                
                    BUY
                
            
        
    
        
            
                
                    3 more offices
                
                
                    
                        2500 WT -credits
                    
                
                
                    BUY
                
            
        
    
        
            
                
                    5 more offices
                
                
                    
                        4000 WT -credits
                    
                
                
                    BUY
                
            
        



    
        
            
                
                    Pay selected packageOffice slots are paid using your account WT -credits.
                
            
            
                
                    Selected package
                    
                
                
                    Package price
                    
                        1000 WT -credits
                    
                
                
                    Current account balance
                    5700
                
                
                    Account balance after purchase
                    4700
                
            
        
    
    
            
                
                    BUY
                
            
    



        
        
            © 2018 - Wandering Tail Oy
        
    
    

    

    

    
    
        $(document).ready(function (e) {
            $(&quot;#form_div&quot;).hide();

            $(&quot;.card&quot;).each(function (index) {
                var footer = $(this).find(&quot;.card-action&quot;);
                var title = $(this).find(&quot;.card-title&quot;);
                var price = $(this).find(&quot;.card-content&quot;);

                footer.children(&quot;a&quot;)
                    .click(function () {
                        $(&quot;#form_package_title&quot;).text(title.children().text());
                        $(&quot;#form_package_price&quot;).text(price.children().text())
                        $(&quot;#form_package_id&quot;).val($(this).data(&quot;packageid&quot;))

                        $(&quot;#form_account_balance&quot;).text(price.children().data(&quot;balancecurrent&quot;));
                        $(&quot;#form_account_balance_after&quot;).text(price.children().data(&quot;balanceafter&quot;));

                        if ($(&quot;#form_div&quot;).is(&quot;:visible&quot;) == false) {
                            $(&quot;#form_div&quot;).toggle(&quot;slow&quot;);
                        }
                    });
            });

            $(&quot;#form_package_submit&quot;).click(function (event) {
                event.preventDefault();
                if (confirm(&quot;Do you really want to buy selected package?&quot;)) {
                    $('#form_package').submit();
                }
            });
        });
    



/html[@class=&quot;js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths&quot;]</value>
   </webElementProperties>
</WebElementEntity>
