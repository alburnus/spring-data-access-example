<#include "./common/standardPage.ftl" />

<@standardPage title="Home">

<h1>Add user by mybatis method</h1>
<form action="/view/teammate" method="post">
    <div class="form-group">
        <label for="name">Name</label>
        <input type="text" class="form-control" id="name" placeholder="User "
               name="name">
    </div>
    <button type="submit" class="btn btn-primary" value="Submit">Book</button>
</form>
</@standardPage>