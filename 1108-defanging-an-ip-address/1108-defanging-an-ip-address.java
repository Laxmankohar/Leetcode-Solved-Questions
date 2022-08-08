class Solution {
    public String defangIPaddr(String address) {
        return address.join("[.]", address.split("\\."));
    }
}