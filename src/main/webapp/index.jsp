<%@ include file="template/taglib.jsp" %>
<c:import url="template/head.jsp" />
<html>
<body>
<div class="container">
    <div class="row">
        <c:import url="template/header.jsp" />
    </div>

    <div class="row">
        <c:import url="template/navigation.jsp" />
    </div>

    <div class="row">
        <h2 class="text-center">Hello World</h2>
    </div>
    <div class="row">
        <form class="form-horizontal">
            <fieldset>

                <!-- Form Name -->
                <legend>Search</legend>

                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="Card Name">Card Name</label>
                    <div class="col-md-4">
                        <input id="Card Name" name="Card Name" type="text" placeholder="Card Name" class="form-control input-md">
                    </div>
                </div>
                <!-- Button -->
                <div class="form-group">
                    <div class="col-md-4">
                        <button id="Search" name="Search" class="btn btn-primary">Search</button>
                    </div>
                </div>

            </fieldset>
        </form>
    </div>
</div>

<c:import url="template/bs-js.jsp" />
</body>
</html>