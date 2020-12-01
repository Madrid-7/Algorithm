package K_means;


import java.util.ArrayList;

/**
 * K-Means算法
 * @author Administrator
 *
 */
public class k_means {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //1.创建二维数组 10x10的数组
        int num_1[]=new int[100];
        int num_2[]=new int[100];

            //随机赋值
        for(int i=0; i<100; i++){
            num_1[i]=(int)( Math.random()*100 );
        }

        for(int i=0; i<100; i++){
            num_2[i]=(int)( Math.random()*100 );
        }

        // 2.创建点坐标
        ArrayList<pointBean> list=new ArrayList<pointBean>();
        pointBean bean;
        for(int i=0;i<100;i++){
            bean=new pointBean();
            bean.point_x=num_1[i];
            bean.point_y=num_2[i];
            list.add(bean);
        }
             // 执行k-means算法
        getDataKMeans test = new getDataKMeans();
        test.setData(list);

    }
}
