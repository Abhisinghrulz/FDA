PSEUDO CODE

````
Pseudo code function(input,partial,output…)
{ 
    if isValidSolution(partial)
    { 
        processSolution(partial)        
        return  
    }  
    candidates = generateCandidates(input,partial)
    for c in candidate 
    {      
        addCandidate(c,input,partial)      
        function(input,partial,output)
        removeCandidate(c,input,partial)  
    } 
}
````