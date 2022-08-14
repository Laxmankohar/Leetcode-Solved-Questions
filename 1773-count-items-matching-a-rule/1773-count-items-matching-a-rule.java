class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
    for (int i=0; i<items.size();i++){

        List<String> item = items.get(i);
        if (ruleKey.equals("type")){
            if (item.get(0).equals(ruleValue)){
                counter++;
            }
        }

        if (ruleKey.equals("color")){
            if (item.get(1).equals(ruleValue)){
                counter++;
            }
        }

        if (ruleKey.equals("name")){
            if (item.get(2).equals(ruleValue)){
                counter++;
            }
        }

    }

    return counter;
}

}