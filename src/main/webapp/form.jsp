<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agende seu Horario | Rede</title>
    <link rel="icon" href="./img/badminton-svg.svg">
    <link rel="stylesheet" type="text/css" href="./css/form.css">
</head>

<body>
  <section class="principal">
    <header>
        <div class="center menu-container">
            <div class="logo">
                <h3><i class="fa-solid fa-volleyball"></i>Rede</h3><i class=""></i>
            </div>
            <div class="menu">
                <a class="menu-ativo" href="index.html">Home</a>
                <a href="form.jsp">Agende seu Horario</a>
                <a href="contato.html">Contato</a>
                 <a href="cadastro.jsp">Cadastros</a>
            </div>
        </div>
    </header>
    <div class="fundo-form">
      <form class="formulario-container"  action="http://localhost:8080/Esporte-mvn/CadastroDeHorario" method="post">
      
        <label for="nome">Nome:</label>
        <input type="text"  name="nome" pattern="[A-Za-z ]+" placeholder="nome completo" required><br>
      
        <label for="esporte">Esporte:</label>
        <select id="esporte" name="esporte" required>
    		<option value="">Escolha uma opção</option>
    		<option value="volei">Vôlei</option>
    		<option value="badminton">Badminton</option>
    		<option value="tenis">Tênis</option>
  		</select><br>
      
        <label for="sets">Número de sets:</label>
        <input type="number"  name="sets" min="1" max="10" placeholder="numero de sets" required><br>
      
        <input type="submit" value="Enviar">
      </form>
   </div>
  </section>
  
  <footer><p>Todos os direitos reservados!</p></footer>
  <script src="https://kit.fontawesome.com/92e057dee7.js"  type="text/javascript"  crossorigin="anonymous"></script>
</body>

