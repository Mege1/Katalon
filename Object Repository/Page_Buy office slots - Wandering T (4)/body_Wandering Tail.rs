<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Wandering Tail</name>
   <tag></tag>
   <elementGuidId>26e515df-4445-4880-a0e3-58572278dba3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
            
                
                    
                        
                        
                        
                    
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
    



/html[@class=&quot;js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths&quot;]/body[1]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers applicationcache svg inlinesvg smil svgclippaths&quot;]/body[1]</value>
   </webElementProperties>
</WebElementEntity>
