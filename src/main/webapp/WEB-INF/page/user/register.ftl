<#include "../common/layout.ftl"/>
<@html page_title="${pageTitle!}" page_tab="user">
    <div class="row">
        <div class="col-md-9">
            <from>
                <input type="text" name="name"/>
                <input type="password" name="password"/>
                <inut type="submit"/>
            </from>
        </div>
        <div class="col-md-3 hidden-sm hidden-xs">
            <#if userinfo??>
                <#include "../components/userinfo.ftl">
                <@info/>
                <#include "../components/createtopic.ftl">
                <@createtopic/>
            </#if>
        </div>
    </div>
</@html>