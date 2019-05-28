
var snackbar;

function showSnackbar(message) {
    if(message.length>0) {
        clearTimeout(snackbar);
        document.getElementById("message-box").style.display = "block";
        document.getElementById("message-box").innerHTML = "<a>"+message+"</a>";
        snackbar=setTimeout(function() {
            document.getElementById("message-box").style.display = "none";
        }, 3000);
    }
}

function addClass(element, className) {
    element.className += " "+className;
}

function removeClass(element, className) {
    element.classList.remove(className);
}


function openInBackground(url) {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            
        }
    };
    xhttp.open("GET", url, true);
    xhttp.send();
}

var currentId;
function loadImage(action, id) {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var json = JSON.parse(this.responseText);
            document.getElementById("selectedImage").src=json.imageUrl;
            currentId=json.currentID;
            if(currentId==json.firstIndex) { 
                addClass(document.getElementById("prevBtn"), "disabled");
            } else {
                removeClass(document.getElementById("prevBtn"), "disabled");
            }
            if(currentId==json.lastIndex) {
                addClass(document.getElementById("nextBtn"), "disabled");
            } else {
                removeClass(document.getElementById("nextBtn"), "disabled");
            }
            
        }
    };
    xhttp.open("GET", "ServletController?action="+action+"&id="+id, true);
    xhttp.send();
}


