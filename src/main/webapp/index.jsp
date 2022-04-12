<%@ include file="template/taglib.jsp" %>
<c:import url="template/head.jsp" />
<script type="text/javascript" class="init">
    $(document).ready( function () {
        $('.searchTable').DataTable();
    } );
</script>
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
        <form class="form-horizontal" action="searchCard" method="GET">
            <fieldset>

                <!-- Form Name -->
                <legend>Search</legend>

                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="searchEntry">Search Term</label>
                    <div class="col-md-4">
                        <input id="searchEntry" name="searchEntry" type="text" placeholder="Search Entry" class="form-control input-md" required>
                        <span class="help-block">Use cardname/[card name] for card name and cardnumber/[card number] for card number</span>
                    </div>
                </div>
                <br>
                <div class="form-group">
                    <div class="col-md-4">
                        <button id="Search" name="Search" class="btn btn-primary">Search</button>
                    </div>
                </div>

            </fieldset>
        </form>
        <c:if test="${errorMSG != null}">
        <div class="alert alert-danger row" role="alert">
            ${errorMSG}
        </div>
        </c:if>

    </div>
</div>
<c:remove var="errorMSG" />
<c:import url="template/bs-js.jsp" />
</body>
</html>