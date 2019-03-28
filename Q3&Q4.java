//Question 3

    public ArrayBag<T> intersection(ArrayBag<T> aSet) {
        ArrayBag<T> inter = new ArrayBag<>();
        ArrayList<Integer> checkedIndex = new ArrayList<>();    
        int i=0;
        while(i<this.numberOfEntries){
            int j=0;
            while(j<aSet.numberOfEntries){
                if(bag[i].equals(aSet.toArray()[j]) && !checkedIndex.contains(j)){//setA and B at [j] is ==
                    inter.add(aSet.bag[i]);
                    checkedIndex.add(j);
                    break;
                }
                else j++;
            }
            i++;
        }
        return inter;
    }


//Question 4


    @Override
    public ArrayBag<T> difference(ArrayBag<T> aSet) {
        ArrayBag<T> diff = new ArrayBag<>();
        ArrayBag<T> intersect = (ArrayBag<T>) this.intersection(aSet);
        ArrayList<Integer> checkedIndex = new ArrayList<>();
        int i=0;
        while(i<this.numberOfEntries){
            int j=0;
            boolean found = false;
            while(j<aSet.numberOfEntries){
                if(bag[i].equals(aSet.toArray()[j]) && !checkedIndex.contains(j)){//setA and B at [j] is ==
                    found = true;
                    checkedIndex.add(j);
                    break;
                }
                else{
                    j++;
                }
            }
            if(found==false) diff.add(bag[i]);
            i++;
        }
        
        return diff;
 
    }

