package com.mingdao.api.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjia on 14-7-1.
 */
public class PushWxNewsMessage extends PushWxMessage {

    private MessageNews news;

    private String msgtype = "news";

    public PushWxNewsMessage(WxNewsArticle wxNewsArticle) {
        List<WxNewsArticle> articles = new ArrayList<WxNewsArticle>();
        articles.add(wxNewsArticle);
        MessageNews messageNews = new MessageNews();
        messageNews.setArticles(articles);
        this.news = messageNews;
    }

    public PushWxNewsMessage(List<WxNewsArticle> articles) {
        MessageNews messageNews = new MessageNews();
        messageNews.setArticles(articles);
        this.news = messageNews;
    }

    public MessageNews getNews() {
        return news;
    }

    public void setNews(MessageNews news) {
        this.news = news;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public class MessageNews {
        private List<WxNewsArticle> articles;

        public List<WxNewsArticle> getArticles() {
            return articles;
        }

        public void setArticles(List<WxNewsArticle> articles) {
            this.articles = articles;
        }
    }
}
