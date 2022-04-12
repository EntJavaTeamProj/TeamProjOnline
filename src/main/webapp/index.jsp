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
                    <label class="col-md-4 control-label" for="searchTerm">Search Term</label>
                    <div class="col-md-4">
                        <input id="searchTerm" name="searchTerm" type="text" placeholder="Search Term" class="form-control input-md" required>
                        <span class="help-block">Use cardname/[card name] for card name and cardnumber/[card number] for card number</span>
                    </div>
                </div>
                <br>
                <div class="form-group">
                    <label class="col-md-4 control-label" for="Types">Type of Card</label>
                    <div class="col-md-4">
                        <select id="Types" name="Types" class="form-control" required>
                            <option value="Digimon">Digimon</option>
                            <option value="Option">Option</option>
                            <option value="Tamer">Tamer</option>
                            <option value="Digi-Egg">Digi-Egg</option>
                        </select>
                    </div>
                </div>
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