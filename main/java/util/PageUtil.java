package util;


public class PageUtil {
    private int currentPage;
    private long totolRecords;
    private int pageSize;
    private int maxPage;

    public PageUtil(long totolRecords, int pageSize,int currentPage) {
        this.totolRecords = totolRecords;
        this.pageSize = pageSize;
        this.maxPage=(int)(totolRecords%pageSize==0?(totolRecords/pageSize):(totolRecords/pageSize+1));
        setCurrentPage(currentPage);
    }
    /**
     * 是否为第一页?
     */
    public boolean isFirstPage(){
        return  currentPage==1;
    }
    /**
     * 是否最后一页?
     */
    public boolean isMaxPage(){
        return currentPage==maxPage;
    }

    /**
     * 获取下一页
     * @return
     */
    public int nextPage(){
        //return currentPage++;
        //自己实现
        return currentPage==maxPage?maxPage:currentPage++;
    }
    /**
     * 获取上一页
     */
    public int prevPage(){
        //return currentPage--;
        //自己实现
        return currentPage==1?1:currentPage--;
    }
    public void setCurrentPage(int currentPage){
        if(currentPage>maxPage) {
            this.currentPage=maxPage;
        }else if(currentPage<1){
            this.currentPage=1;
        }else{
            this.currentPage=currentPage;
        }
    }
    public  int getCurrentPage(){
        return this.currentPage;
    }
    public int getMaxPage(){
        return maxPage;
    }
}
