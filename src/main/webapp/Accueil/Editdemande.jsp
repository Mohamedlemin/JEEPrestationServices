<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>client</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
</head>
<body>
<div class="contaire col-md-10 col-md-offset-1">
<div class="contaire">
<div class="panel panel-primary">
<div class="panel-heading">update Client</div>
<div class="panel-body">
<form action="updatedemande.php" method="POST">
	<input type="hidden" name="id"value="${demande.id}"/>
														<div class="row">
															<div class="col-md-6 pr-0">
																<div class="form-group form-group-default">
																	<label>Client</label>
																		<select class="form-control form-control" id="defaultSelect" name="client" value="selmina">
																		<c:forEach items="${model1.clients}" var="c">
													<option>${c.nom}</option>
													</c:forEach>
													</select>
																</div>
															</div>
															<div class="col-md-6 pr-0">
																<div class="form-group form-group-default">
																	<label>accueil</label>
																	
																	<select class="form-control form-control" id="defaultSelect"name="accuiel" value="${demande.accuiel}">
																		<c:forEach items="${accueils}" var="c">
													<option value="${c}">${c}</option>
													</c:forEach>
												</select>
																</div>
															</div>
															<div class="col-md-6 pr-0">
																<div class="form-group form-group-default">
																	<label>service</label>
																	
																	<select class="form-control form-control" id="defaultSelect"name="service" value="application">
																		<c:forEach items="${services}" var="c">
													<option value="${c}">${c}</option>
													</c:forEach>
												</select>
																</div>
															</div>
																<div class="col-md-6 pr-0">
																<div class="form-group form-group-default">
																	<label>date_creation</label>
																	<input name="date" type="text" class="form-control" value="${demande.date_creation}">
																</div>
															</div>
																<div class="col-md-6 pr-0">
																<div class="form-group form-group-default">
																	<label>Status</label>
																	<input name="status" type="text" class="form-control" value="${demande.status}">
																</div>
															</div>
																<div class="col-md-6 pr-0">
																<div class="form-group form-group-default">
																	<label>description</label>
																	<input name="description" type="text" class="form-control" value="${demande.description}">
																</div>
															</div>
														</div>
													
												</div>
												<div class="modal-footer no-bd">
													<button type="submit"  class="btn btn-success " id="alert_demo_4"">EDITER</button>
													
													<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
												</div></form>
											</div>

</div>
</div>
<div>
</div>
</body>
</html>