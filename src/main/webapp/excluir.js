function excluir(idHorario) {
    var confirmacao = confirm("Deseja realmente excluir o horario?");
    if (confirmacao) {
        var xhr = new XMLHttpRequest();
        xhr.open("DELETE", "http://localhost:8080/Esporte-mvn/ExcluiHorario?idHorario=" + idHorario, true); 
        xhr.send();
        location.reload();
    }
}
