package pers.posse.tool.service.impl.JDBC;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by posse on 17-7-20.
 */
public class InitHibernate {
    /***
     * Hibernate运行过程：
         1.通过Configuration().configure();读取并解析hibernate.cfg.xml配置文件
         2.由hibernate.cfg.xml中的<mappingresource="com/xx/domain.hbm.xml"/>读取并解析映射信息
         3.通过config.buildSessionFactory();//创建SessionFactory
         4.sessionFactory.openSession();//打开Sesssion
         5.session.beginTransaction();//创建事务Transation
         6.persistent operate持久化操作 //一般指Save这个方法
         7.session.getTransaction().commit();//提交事务
         8.关闭Session
         9.关闭SesstionFactory
     */



    private static ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();
    private static SessionFactory sessionFactory = null;

    static {
        sessionFactory = new Configuration().buildSessionFactory();
    }

    public static Session openSession(){
        return sessionFactory.openSession();
    }

    public static Session getCurrentSession() {
        Session session=threadLocal.get();
        if(session==null){
            session=sessionFactory.openSession();
            threadLocal.set(session);
        }
        return session;
    }

    public static SessionFactory getSessionFactory () {
        return sessionFactory;
    }

    public static void closeCurrentSession(){
        Session s = getCurrentSession();
        if (s != null && s.isOpen()) {
            s.close();
            threadLocal.set(null);
        }
    }
}
