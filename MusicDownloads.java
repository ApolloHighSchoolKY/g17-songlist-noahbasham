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
    for(String x: titles)
    {
      if(x.getDownloadInfo==null)
      {
        downloadList.add(new DownloadInfo(x));
      }
      else
        x.getDownloadInfo.incrementTimesDownloaded();
    }
  }
}
