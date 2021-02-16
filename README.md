## GET/PUT COVARIÂNCIA



 📍 Na prática ... 


        List<Integer> intList  = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);

        ⚠️ Vamos receber uma lista que seja subtipo de Number ou propio Number. 
        List<? extends Number> list = intList;
         
        
        ✅ GET OK !         
        Number x = list.get(0);

        ❌ PUT ERROR !
        list.add(20);

        ⚠️ Error,pois o compilador não sabe se o número inteiro,
        vai ser compatível com algum outro possível tipo Number.


        
