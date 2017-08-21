package tears.service.impl;

import tears.dao.UserDao;
import tears.dao.impl.UserDaoImpl;
import tears.database.UserGoodsData;

public class UserOrderingGoods {

  public static String orderingGood(Long id,int order){
      UserGoodsData dataGoods = new UserGoodsData();
      UserDao userDao=new UserDaoImpl();
      if(order>=0&&order<=2){
          System.out.println("User: "+userDao.getById(id)+" has ordered good: "+dataGoods.goods[order]);
          return dataGoods.goods[order];
      }else{
          System.out.println("We don't have such kind of goods!");
          return null;
      }
  }
}
