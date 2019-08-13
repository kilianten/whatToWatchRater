
function changeBackground(colour){
    document.getElementById("main").style.backgroundColor = colour;
};

var boxes = document.getElementsByClassName('box');
var rated = false;
var rating = 0;

function fillBlocks(block){
    if(rated == false){
	colourBlocks(block.id);
    }
};

function emptyBlocks(){
  if(rated == false){
	  for(i = 0; i < boxes.length; i++){
	     boxes[i].style.opacity = 0;
	  }
  }
}

function rate(block){

  if(block.id == rating){
    rated = false;
    rating = null;
    return;
  }


  rated = true;
  rating = block.id;  
  colourBlocks(block.id);
  uncolourBlocks(block.id);
}

function colourBlocks(numOfBlocks){
	for(i = 0; i < boxes.length; i++){
		if(boxes[i].id <= numOfBlocks){
		   boxes[i].style.opacity = 1;
		}
	}
}

function uncolourBlocks(numOfBlocks){
	for(i = 0; i < boxes.length; i++){
		if(boxes[i].id > numOfBlocks){
		   boxes[i].style.opacity = 0;
		}
	}
}