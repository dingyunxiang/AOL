/**
 * Created by dingyunxiang on 16/3/10.
 */
public class Sort {

    public static void main(String args[]){
        Sort sort = new Sort();


        //设置两组值
        int[] array = {7,11,11,5,9,2,0,0,1};
        int[] array1 = {1};

        //冒泡
        sort.select(array);
        sort.select(array1);

        //


        for(int i:array)
            System.out.print(i+"-");
        System.out.println();
        for(int i:array1){
            System.out.print(i+"-");
        }
    }



    //冒泡排序
    //原理是遍历一遍找到最大的,冒泡到末尾,然后采用同样的方法,冒泡到倒数第二个,直道结束
    public void bubble(int[] nums){
        int n = nums.length;
        if(nums == null || nums.length < 0) return ;
        for(int i = 0;i <= n-1;i++){
            for(int j = 1;j <= n-1-i;j++){
                if(nums[j-1] > nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    //选择排序,每次选择最小的,将其直接换到数组头,并且将初始位置后挪一位
    public void select(int[] nums){
        int n = nums.length;
        if(nums == null || nums.length<0) return;

        int min;
        for(int i = 0;i <= n-1;i++){
            min = i;
            for(int j = i;j <= n-1;j++){
                if(nums[j]<nums[min]) {
                    min = j;
                }
            }

            //swap
            int temp = nums[min];
            nums[min] = nums[i] ;
            nums[i] = temp;
        }
    }

    //插入排序
    public void insert(int[] nums){
        int n = nums.length;
        if(nums == null || nums.length<0) return;




    }









}
