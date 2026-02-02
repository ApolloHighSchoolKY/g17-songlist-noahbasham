public class MusicDownloads{
  private List<DownloadInfo> downloadList;

  public MusicDownloads()
  {   downloadList = new ArrayList<DownloadInfo>();   }

  public DownloadInfo getDownloadInfo(String title)
  {
    /* To be implemented in part (a) */
    for(DownloadInfo x: downloadList)
    {
      if(title.equals(x.getTitle()))
        return x;
    }

    return null;

  }

  public void updateDownloadInfo(List<String> titles)
  {
    /* To be implemented in part (b) */
    for(int i=0;i<titles.length();i++)
    {
      if(titles.get(i).getDownloadInfo==null)
      {
        downloadList.add(new DownloadInfo(titles.get(i)));
      }
      else
        titles.get(i).getDownloadInfo.incrementTimesDownloaded();
    }
  }
}
