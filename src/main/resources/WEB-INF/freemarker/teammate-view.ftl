<#include "./common/standardPage.ftl" />

<@standardPage title="Home">

<h1>All teammates</h1>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Name</th>
    </tr>
    </thead>
    <tbody>
    <#list teammates as user>
    <tr>
        <th scope="row">${user.name}</th>
    </tr>
    </#list>
    </tbody>
</table>

<a href="/view/teammate/new" <button class="btn btn-primary">Create new</button>

</@standardPage>