<#import "parts/common.ftlh" as c>

<@c.page>
    User editor

    <form action="/user" method="post">
        <input type="text" name="username" value="${user.username}">
        <#list roles as role>
            <div>
                <label><input type="checkbox" name="${role}"${user.role?seq_contains((role)?string("checked",""))}>${role}</label>
            </div>
        </#list>
        <input type="hidden" value="${user.id}" name="userID">
        <input type="text" value="${_csrf.token}" name="_csrf">
        <button type="submint">Save</button>
    </form>
</@c.page>