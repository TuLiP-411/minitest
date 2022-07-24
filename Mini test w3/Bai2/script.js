var arr = [4,5,6]

function add() {
    let a = document.getElementById("view").value
    arr.push(a)
}

function display() {
    let txt = "";
    for (let i = 0; i < arr.length; i++) {
        txt += "Phần tử thứ " + (i + 1) + " = " + arr[i] + "<br/>"
    }
    document.getElementById("mes").innerHTML = txt;


}