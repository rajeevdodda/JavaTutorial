package com.telusuko;

public class UserException {
    public static void main(String[] args) throws Exception {
        int i, j;
        i = 8;
        j = 9;

        try {
            int k = i / j;

            if (k == 0) {
                throw new RajeevException("rajeev exception message");
            }
        } catch (RajeevException e) {
            System.out.println(e.getMessage());
        }
    }

}
