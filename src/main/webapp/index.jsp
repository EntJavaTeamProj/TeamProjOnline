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
                    <label class="col-md-4 control-label" for="Card Name">Card Name</label>
                    <div class="col-md-4">
                        <input id="Card Name" name="searchTerm" type="text" placeholder="Card Name" class="form-control input-md">
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
        <!-- Card Result -->
        <c:if test="${cards != null}">
            <div class="row">
                <table class="searchTable display table table-hover">
                    <thead>
                    <th>Card Name</th>
                    <th>Card Number</th>
                    </thead>
                    <tbody>
                    <c:forEach var="card" items="${cards}">
                        <tr>
                            <th>${card.cardName}</th>
                            <th>${card.cardNumber}</th>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </c:if>

    </div>
</div>
<c:remove var="cards" />
<c:import url="template/bs-js.jsp" />
</body>
</html>