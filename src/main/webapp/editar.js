function editar(idHorario) {
    var nome = prompt("Digite o novo nome:");
    var esporte = prompt("Digite o novo esporte:");
    var sets = prompt("Digite o novo numero de sets:");

    if (nome && esporte && sets) {
        
        var xhr = new XMLHttpRequest();
        
        xhr.open("POST", "http://localhost:8080/Esporte-mvn/EditaHorario", true);
        
        xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
     
        xhr.send("idHorario=" + idHorario + "&nome=" + nome + "&esporte=" + esporte + "&sets=" + sets);
        
        location.reload();
    }
}
