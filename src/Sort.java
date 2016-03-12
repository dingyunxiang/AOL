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
        int[] num = sort.mergeSort(array,0,8);
//        sort.mergeSort(array1,0,0);

        //


        for(int i:num)
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
    //插入排序的思路就是维护一个已经排好序的数组,再遍历剩下的数,将其插入已经排好序的数组,,即可将整个数组排序
    public void insert(int[] nums){
        int n = nums.length;
        if(nums == null || nums.length<0) return;

        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
                else
                    break;
            }
        }


    }


    //归并排序
    //利用递归的思想,将函数分成有序的数组,再将两个数组合并˚
    public int[] mergeSort(int[] nums,int low,int high){



        int mid = (low+high) / 2;

        if(low<high){
            mergeSort(nums,low,mid);

            mergeSort(nums,mid+1,high);

            merge(nums,low,high,mid);
        }

        return nums;
    }

    //h-head t-tail
    public void merge(int[] nums,int low,int high,int mid){

        int[] temp = new int[high - low +1];

        int i = low;
        int j = mid + 1;
        int k = 0;

       while(i <= mid && j<=high){
            if(nums[i]<nums[j]){
                temp[k++] = nums[i++];
            }
           else
                temp[k++] = nums[j++];
        }


        while(i<=mid){
            temp[k++] = nums[i++];
        }

        while(j<=high){
            temp[k++] = nums[j++];
        }

        for(int k1 = 0;k1<temp.length;k1++){
            nums[k1+low] = temp[k1];
        }
    }











}
