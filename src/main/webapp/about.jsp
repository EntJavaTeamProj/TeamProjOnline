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
    <h2 class="text-center">About This Project</h2>
  </div>

  <div class="row">
    <p>About</p>
    <p>Implements both the tcgplayer api and digimoncard.io api to combine card information and card pricing information into a neat package. Made to be implemented into more advanced programs so that card searches on those programs provide more in depth information</p>
    <p class="text-reset text-decoration-none"><a href="https://github.com/EntJavaTeamProj/TeamProjOnline.git">Github Repo</a></p>
    <p class="text-reset text-decoration-none"><a href="https://docs.tcgplayer.com/docs/getting-started">TCGPlayer API</a></p>
    <p class="text-reset text-decoration-none"><a href="https://documenter.getpostman.com/view/14059948/TzecB4fH">digimoncard.io API</a></p>
  </div>
</div>
<c:import url="template/bs-js.jsp" />
</body>
</html>