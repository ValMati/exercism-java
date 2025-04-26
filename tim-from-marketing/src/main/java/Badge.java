class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder result = new StringBuilder();

        if(id != null){
            result.append(String.format("[%s] - ", id));
        }

        result.append(String.format("%s - ", name));

        result.append(department != null ? department.toUpperCase() : "OWNER");

        return result.toString();
    }
}
