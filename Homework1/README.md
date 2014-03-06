




<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>clojure-homework/tasks/01/README.markdown at master · fmi/clojure-homework</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <meta property="fb:app_id" content="1401488693436528"/>

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="fmi/clojure-homework" name="twitter:title" /><meta content="clojure-homework - Clojure course assignments" name="twitter:description" /><meta content="https://2.gravatar.com/avatar/3695f793f15f3424f5c1d5facb93ac03?d=https%3A%2F%2Fidenticons.github.com%2F92fd75f50845c27049aac9e7aec23848.png&amp;r=x&amp;s=400" name="twitter:image:src" />
<meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://2.gravatar.com/avatar/3695f793f15f3424f5c1d5facb93ac03?d=https%3A%2F%2Fidenticons.github.com%2F92fd75f50845c27049aac9e7aec23848.png&amp;r=x&amp;s=400" property="og:image" /><meta content="fmi/clojure-homework" property="og:title" /><meta content="https://github.com/fmi/clojure-homework" property="og:url" /><meta content="clojure-homework - Clojure course assignments" property="og:description" />

    <meta name="hostname" content="github-fe121-cp1-prd.iad.github.net">
    <meta name="ruby" content="ruby 2.1.0p0-github-tcmalloc (87c9373a41) [x86_64-linux]">
    <link rel="assets" href="https://github.global.ssl.fastly.net/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035/">
    <link rel="xhr-socket" href="/_sockets" />


    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="4E5A6739:3CF6:C08A3E:53179912" name="octolytics-dimension-request_id" /><meta content="3754688" name="octolytics-actor-id" /><meta content="PuloV" name="octolytics-actor-login" /><meta content="4f0d21baba14975748a0c50f5b0c89bb6bff0f15f53847cf0a9f611414b0a721" name="octolytics-actor-hash" />
    

    
    
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="GzToq8BLBRQgJ/gK3dXABntYtHDGoIiEsL/zUewxd5k=" name="csrf-token" />

    <link href="https://github.global.ssl.fastly.net/assets/github-144f6fbd93cc11df8cc03bc000351f75fa1e5875.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://github.global.ssl.fastly.net/assets/github2-ff993fcf465373a314708ecedfbbffc29250b930.css" media="all" rel="stylesheet" type="text/css" />
    
    


      <script crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/frameworks-490867a148cf94468c141093ccd4e56ed2144eb9.js" type="text/javascript"></script>
      <script async="async" crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/github-c79d5b8a91c439deb50d832dd0254c1dc6506298.js" type="text/javascript"></script>
      
      <meta http-equiv="x-pjax-version" content="a66854668ec29c106d5035282094d58f">

        <link data-pjax-transient rel='permalink' href='/fmi/clojure-homework/blob/29cad0b1817d7ecf75fcfdb66862766a973ffa9a/tasks/01/README.markdown'>

  <meta name="description" content="clojure-homework - Clojure course assignments" />

  <meta content="601547" name="octolytics-dimension-user_id" /><meta content="fmi" name="octolytics-dimension-user_login" /><meta content="8647532" name="octolytics-dimension-repository_id" /><meta content="fmi/clojure-homework" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="8647532" name="octolytics-dimension-repository_network_root_id" /><meta content="fmi/clojure-homework" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/fmi/clojure-homework/commits/master.atom" rel="alternate" title="Recent Commits to clojure-homework:master" type="application/atom+xml" />

  </head>


  <body class="logged_in  env-production linux vis-public page-blob tipsy-tooltips">
    <div class="wrapper">
      
      
      
      


      <div class="header header-logged-in true">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/">
  <span class="mega-octicon octicon-mark-github"></span>
</a>

    
    <a href="/notifications" aria-label="You have no unread notifications" class="notification-indicator tooltipped tooltipped-s" data-gotokey="n">
        <span class="mail-status all-read"></span>
</a>

      <div class="command-bar js-command-bar  in-repository">
          <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">

<input type="text" data-hotkey=" s" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" autocapitalize="off"
    
    data-username="PuloV"
      data-repo="fmi/clojure-homework"
      data-branch="master"
      data-sha="f2e1acc6199f50bcab25520c6d6673043124f9a8"
  >

    <input type="hidden" name="nwo" value="fmi/clojure-homework" />

    <div class="select-menu js-menu-container js-select-menu search-context-select-menu">
      <span class="minibutton select-menu-button js-menu-target" role="button" aria-haspopup="true">
        <span class="js-select-button">This repository</span>
      </span>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container" aria-hidden="true">
        <div class="select-menu-modal">

          <div class="select-menu-item js-navigation-item js-this-repository-navigation-item selected">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" class="js-search-this-repository" name="search_target" value="repository" checked="checked" />
            <div class="select-menu-item-text js-select-button-text">This repository</div>
          </div> <!-- /.select-menu-item -->

          <div class="select-menu-item js-navigation-item js-all-repositories-navigation-item">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" name="search_target" value="global" />
            <div class="select-menu-item-text js-select-button-text">All repositories</div>
          </div> <!-- /.select-menu-item -->

        </div>
      </div>
    </div>

  <span class="help tooltipped tooltipped-s" aria-label="Show command bar help">
    <span class="octicon octicon-question"></span>
  </span>


  <input type="hidden" name="ref" value="cmdform">

</form>
        <ul class="top-nav">
          <li class="explore"><a href="/explore">Explore</a></li>
            <li><a href="https://gist.github.com">Gist</a></li>
            <li><a href="/blog">Blog</a></li>
          <li><a href="https://help.github.com">Help</a></li>
        </ul>
      </div>

    


  <ul id="user-links">
    <li>
      <a href="/PuloV" class="name">
        <img alt="PuloV" class=" js-avatar" data-user="3754688" height="20" src="https://avatars3.githubusercontent.com/u/3754688?s=140" width="20" /> PuloV
      </a>
    </li>

    <li class="new-menu dropdown-toggle js-menu-container">
      <a href="#" class="js-menu-target tooltipped tooltipped-s" aria-label="Create new...">
        <span class="octicon octicon-plus"></span>
        <span class="dropdown-arrow"></span>
      </a>

      <div class="new-menu-content js-menu-content">
      </div>
    </li>

    <li>
      <a href="/settings/profile" id="account_settings"
        class="tooltipped tooltipped-s"
        aria-label="Account settings ">
        <span class="octicon octicon-tools"></span>
      </a>
    </li>
    <li>
      <a class="tooltipped tooltipped-s" href="/logout" data-method="post" id="logout" aria-label="Sign out">
        <span class="octicon octicon-log-out"></span>
      </a>
    </li>

  </ul>

<div class="js-new-dropdown-contents hidden">
  

<ul class="dropdown-menu">
  <li>
    <a href="/new"><span class="octicon octicon-repo-create"></span> New repository</a>
  </li>
  <li>
    <a href="/organizations/new"><span class="octicon octicon-organization"></span> New organization</a>
  </li>


</ul>

</div>


    
  </div>
</div>

      

        




          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        

<ul class="pagehead-actions">

    <li class="subscription">
      <form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="GzToq8BLBRQgJ/gK3dXABntYtHDGoIiEsL/zUewxd5k=" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="8647532" />

    <div class="select-menu js-menu-container js-select-menu">
      <a class="social-count js-social-count" href="/fmi/clojure-homework/watchers">
        9
      </a>
      <span class="minibutton select-menu-button with-count js-menu-target" role="button" tabindex="0" aria-haspopup="true">
        <span class="js-select-button">
          <span class="octicon octicon-eye-watch"></span>
          Watch
        </span>
      </span>

      <div class="select-menu-modal-holder">
        <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
          <div class="select-menu-header">
            <span class="select-menu-title">Notification status</span>
            <span class="octicon octicon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-list js-navigation-container" role="menu">

            <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input checked="checked" id="do_included" name="do" type="radio" value="included" />
                <h4>Not watching</h4>
                <span class="description">You only receive notifications for conversations in which you participate or are @mentioned.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-watch"></span>
                  Watch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_subscribed" name="do" type="radio" value="subscribed" />
                <h4>Watching</h4>
                <span class="description">You receive notifications for all conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-unwatch"></span>
                  Unwatch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_ignore" name="do" type="radio" value="ignore" />
                <h4>Ignoring</h4>
                <span class="description">You do not receive any notifications for conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-mute"></span>
                  Stop ignoring
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

</form>
    </li>

  <li>
  

  <div class="js-toggler-container js-social-container starring-container ">
    <a href="/fmi/clojure-homework/unstar"
      class="minibutton with-count js-toggler-target star-button starred"
      aria-label="Unstar this repository" data-remote="true" data-method="post" rel="nofollow">
      <span class="octicon octicon-star-delete"></span><span class="text">Unstar</span>
    </a>

    <a href="/fmi/clojure-homework/star"
      class="minibutton with-count js-toggler-target star-button unstarred"
      aria-label="Star this repository" data-remote="true" data-method="post" rel="nofollow">
      <span class="octicon octicon-star"></span><span class="text">Star</span>
    </a>

      <a class="social-count js-social-count" href="/fmi/clojure-homework/stargazers">
        1
      </a>
  </div>

  </li>


        <li>
          <a href="/fmi/clojure-homework/fork" class="minibutton with-count js-toggler-target fork-button lighter tooltipped-n" title="Fork this repo" rel="facebox nofollow">
            <span class="octicon octicon-git-branch-create"></span><span class="text">Fork</span>
          </a>
          <a href="/fmi/clojure-homework/network" class="social-count">14</a>
        </li>


</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="repo-label"><span>public</span></span>
          <span class="mega-octicon octicon-repo"></span>
          <span class="author">
            <a href="/fmi" class="url fn" itemprop="url" rel="author"><span itemprop="title">fmi</span></a>
          </span>
          <span class="repohead-name-divider">/</span>
          <strong><a href="/fmi/clojure-homework" class="js-current-repository js-repo-home-link">clojure-homework</a></strong>

          <span class="page-context-loader">
            <img alt="Octocat-spinner-32" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
          </span>

        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline js-new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            

<div class="sunken-menu vertical-right repo-nav js-repo-nav js-repository-container-pjax js-octicon-loaders">
  <div class="sunken-menu-contents">
    <ul class="sunken-menu-group">
      <li class="tooltipped tooltipped-w" aria-label="Code">
        <a href="/fmi/clojure-homework" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-gotokey="c" data-pjax="true" data-selected-links="repo_source repo_downloads repo_commits repo_tags repo_branches /fmi/clojure-homework">
          <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


      <li class="tooltipped tooltipped-w" aria-label="Pull Requests">
        <a href="/fmi/clojure-homework/pulls" aria-label="Pull Requests" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-gotokey="p" data-selected-links="repo_pulls /fmi/clojure-homework/pulls">
            <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull Requests</span>
            <span class='counter'>0</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


        <li class="tooltipped tooltipped-w" aria-label="Wiki">
          <a href="/fmi/clojure-homework/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_wiki /fmi/clojure-homework/wiki">
            <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>
    </ul>
    <div class="sunken-menu-separator"></div>
    <ul class="sunken-menu-group">

      <li class="tooltipped tooltipped-w" aria-label="Pulse">
        <a href="/fmi/clojure-homework/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="pulse /fmi/clojure-homework/pulse">
          <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Graphs">
        <a href="/fmi/clojure-homework/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_graphs repo_contributors /fmi/clojure-homework/graphs">
          <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Network">
        <a href="/fmi/clojure-homework/network" aria-label="Network" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-selected-links="repo_network /fmi/clojure-homework/network">
          <span class="octicon octicon-git-branch"></span> <span class="full-word">Network</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
    </ul>


  </div>
</div>

              <div class="only-with-full-nav">
                

  

<div class="clone-url open"
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone">
  <h3><strong>HTTPS</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/fmi/clojure-homework.git" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/fmi/clojure-homework.git" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="ssh"
  data-url="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=clone">
  <h3><strong>SSH</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="git@github.com:fmi/clojure-homework.git" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="git@github.com:fmi/clojure-homework.git" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone">
  <h3><strong>Subversion</strong> checkout URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/fmi/clojure-homework" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/fmi/clojure-homework" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


<p class="clone-options">You can clone with
      <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a>,
      <a href="#" class="js-clone-selector" data-protocol="ssh">SSH</a>,
      or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <span class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <a href="https://help.github.com/articles/which-remote-url-should-i-use">
    <span class="octicon octicon-question"></span>
    </a>
  </span>
</p>



                <a href="/fmi/clojure-homework/archive/master.zip"
                   class="minibutton sidebar-button"
                   title="Download this repository as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:31133cb87e455767929f720656532fe3 -->

<p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

<a href="/fmi/clojure-homework/find/master" data-pjax data-hotkey="t" class="js-show-file-finder" style="display:none">Show File Finder</a>

<div class="file-navigation">
  

<div class="select-menu js-menu-container js-select-menu" >
  <span class="minibutton select-menu-button js-menu-target" data-hotkey="w"
    data-master-branch="master"
    data-ref="master"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button">master</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-remove-close js-menu-close"></span>
      </div> <!-- /.select-menu-header -->

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div><!-- /.select-menu-tabs -->
      </div><!-- /.select-menu-filters -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/fmi/clojure-homework/blob/master/tasks/01/README.markdown"
                 data-name="master"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="master">master</a>
            </div> <!-- /.select-menu-item -->
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

    </div> <!-- /.select-menu-modal -->
  </div> <!-- /.select-menu-modal-holder -->
</div> <!-- /.select-menu -->

  <div class="breadcrumb">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/fmi/clojure-homework" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">clojure-homework</span></a></span></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/fmi/clojure-homework/tree/master/tasks" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">tasks</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/fmi/clojure-homework/tree/master/tasks/01" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">01</span></a></span><span class="separator"> / </span><strong class="final-path">README.markdown</strong> <span aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="tasks/01/README.markdown" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


  <div class="commit commit-loader file-history-tease js-deferred-content" data-url="/fmi/clojure-homework/contributors/master/tasks/01/README.markdown">
    Fetching contributors…

    <div class="participation">
      <p class="loader-loading"><img alt="Octocat-spinner-32-eaf2f5" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32-EAF2F5.gif" width="16" /></p>
      <p class="loader-error">Cannot retrieve contributors at this time</p>
    </div>
  </div>

<div class="file-box">
  <div class="file">
    <div class="meta clearfix">
      <div class="info file-name">
        <span class="icon"><b class="octicon octicon-file-text"></b></span>
        <span class="mode" title="File Mode">file</span>
        <span class="meta-divider"></span>
          <span>133 lines (93 sloc)</span>
          <span class="meta-divider"></span>
        <span>7.356 kb</span>
      </div>
      <div class="actions">
        <div class="button-group">
                <a class="minibutton tooltipped tooltipped-n js-update-url-with-hash"
                   aria-label="Clicking this button will automatically fork this project so you can edit the file"
                   href="/fmi/clojure-homework/edit/master/tasks/01/README.markdown"
                   data-method="post" rel="nofollow">Edit</a>
          <a href="/fmi/clojure-homework/raw/master/tasks/01/README.markdown" class="button minibutton " id="raw-url">Raw</a>
            <a href="/fmi/clojure-homework/blame/master/tasks/01/README.markdown" class="button minibutton js-update-url-with-hash">Blame</a>
          <a href="/fmi/clojure-homework/commits/master/tasks/01/README.markdown" class="button minibutton " rel="nofollow">History</a>
        </div><!-- /.button-group -->
          <a class="minibutton danger empty-icon tooltipped tooltipped-s"
             href="/fmi/clojure-homework/delete/master/tasks/01/README.markdown"
             aria-label="Fork this project and delete file"
             data-method="post" data-test-id="delete-blob-file" rel="nofollow">
          Delete
        </a>
      </div><!-- /.actions -->
    </div>
      
  <div id="readme" class="blob instapaper_body">
    <article class="markdown-body entry-content" itemprop="mainContentOfPage"><h1>
<a name="%D0%A1%D0%B5%D0%B4%D0%B5%D0%BC-%D0%BC%D0%B0%D0%BB%D0%BA%D0%B8-%D1%84%D1%83%D0%BD%D0%BA%D1%86%D0%B8%D0%B8" class="anchor" href="#%D0%A1%D0%B5%D0%B4%D0%B5%D0%BC-%D0%BC%D0%B0%D0%BB%D0%BA%D0%B8-%D1%84%D1%83%D0%BD%D0%BA%D1%86%D0%B8%D0%B8"><span class="octicon octicon-link"></span></a>Седем малки функции</h1>

<div></div>

<p>Ученето на нов език е най-забавно в началото. За да прихванете това-онова от
езика, искаме от вас да имплементирате 7 малки функции.</p>

<h2>
<a name="digits" class="anchor" href="#digits"><span class="octicon octicon-link"></span></a>digits</h2>

<p>Напишете функция <code>digits</code>, която приема число и връща цифрите му (в десетична
бройна система). Цифрите трябва да са подредени в същия ред, в който са в
числото:</p>

<pre><code>(digits 1024) ; [1 0 2 4]
</code></pre>

<p>Ако резултата се подаде на <a href="/fmi/clojure-homework/blob/master/challenges/1">from-digits</a>, трябва да поучите
оригиналното число.</p>

<h2>
<a name="prime-factors" class="anchor" href="#prime-factors"><span class="octicon octicon-link"></span></a>prime-factors</h2>

<p>Напишете функция <code>prime-factors</code>, която приема число и връща последователност
от простите му множители. Множителите трябва да са подредени във възходящ ред
и всеки трябва да се среща толкова пъти, колкото пъти дели числото:</p>

<pre><code>(prime-factors 6)   ; [2 3]
(prime-factors 300) ; [2 2 3 5 5]
</code></pre>

<p>Изразът <code>(apply * (prime-factors n))</code> трябва да се оценява до <code>n</code>.</p>

<h2>
<a name="fizzbuzz" class="anchor" href="#fizzbuzz"><span class="octicon octicon-link"></span></a>fizzbuzz</h2>

<p>Напешете функция <code>fizzbuzz</code> приемаща число <em>n</em> и връщаща последователност
съдържаща числата от 1 до <em>n</em>, като:</p>

<ul>
<li>Вместо всяко число, което се дели на 3 има <code>"fizz"</code>
</li>
<li>Вместо всяко число, което се дели на 5 има <code>"buzz"</code>
</li>
<li>Вместо всяко число, което се дели на 3 и на 5 има <code>"fizzbuzz"</code>
</li>
</ul><p>Например:</p>

<pre><code>(fizzbuzz 7) ; [1 2 "fizz" 4 "buzz" "fizz" 7]
</code></pre>

<h2>
<a name="densities" class="anchor" href="#densities"><span class="octicon octicon-link"></span></a>densities</h2>

<p>Напишете функция <code>densities</code>, приемаща последователност и връщаща нова
последователност, в която на мястото на всеки елемент от подадената
последователност се съдържа броя пъти, в което елемента се намира в нея.</p>

<p>Например:</p>

<pre><code>(densities [:a :a :b :b :c :a]) ; [3 3 2 2 1 3]
</code></pre>

<h2>
<a name="index-by" class="anchor" href="#index-by"><span class="octicon octicon-link"></span></a>index-by</h2>

<p>Напишете функция <code>index-by</code>, която приема функция <em>f</em> и последователност <em>xs</em>
и връща мап, в който всеки елемент <code>x</code> от <em>xs</em> е стойност, към която сочи ключ
<code>(f x)</code>. Например:</p>

<pre><code>(index-by count ["mu" "foo" "larodi"])
; {2 "mu", 3 "foo", 6 "larodi"}
</code></pre>

<p>Ако два елемента биха имали един ключ, няма значение кой от тях ще изберете за
стойност. В следващия пример и двата резултата са валидни:</p>

<pre><code>(index-by count ["foo" "bar"])
; {3 "foo"}
; {3 "bar"}
</code></pre>

<h2>
<a name="harmonic" class="anchor" href="#harmonic"><span class="octicon octicon-link"></span></a>harmonic</h2>

<p>Напишете функция <code>harmonic</code>, която да връща <em>n</em>-тото <a href="http://en.wikipedia.org/wiki/Harmonic_number">хармонично
число</a>:</p>

<p>$$ H_n = \sum_{i=1}^{n}\frac{1}{i}
       = \frac{1}{2} + \frac{1}{2} + \cdots + \frac{1}{n} $$</p>

<p>Например:</p>

<pre><code>(harmonic 2) ; 3/2
(harmonic 3) ; 11/6
</code></pre>

<p>Функцията е нужно да работи само с положителни числа.</p>

<h2>
<a name="uniquify" class="anchor" href="#uniquify"><span class="octicon octicon-link"></span></a>uniquify</h2>

<p>Напишете функция <code>uniquify</code>, която приема последователност от низове <em>xs</em> и
връща нова последователност, в която всяко повторно срещане на низа е
заместено с друг низ. Новия низ се получава с добавяне на тире и броя срещания
до момента. Например:</p>

<pre><code>(uniquify ["a" "b" "a" "b" "a"]) ; ["a" "b" "a-1" "b-1" "a-2" ]
</code></pre>

<p>Приемете, че входните низове не съдържат тирета, т.е., <code>["a" "a" "a-1"]</code> не е
валиден вход.</p>

<h2>
<a name="%D0%91%D0%B5%D0%BB%D0%B5%D0%B6%D0%BA%D0%B8" class="anchor" href="#%D0%91%D0%B5%D0%BB%D0%B5%D0%B6%D0%BA%D0%B8"><span class="octicon octicon-link"></span></a>Бележки</h2>

<ul>
<li>"Приема последователност" значи "приема <strong>всякаква</strong> последователност".</li>
<li>"Връща последователност" значи "връща <strong>каквато и да е</strong> последователност".</li>
<li>Свободни сте да си дефинирате помощни функции, имена и каквото още поискате.</li>
<li>Употребата на неща извън <code>clojure.core</code> е забранена.</li>
<li>
<a href="http://clojure.org/cheatsheet">Clojure cheatsheet</a> е ваш приятел.</li>
<li>
<strong>Пуснете си <a href="https://github.com/fmi/clojure-homework/blob/master/tasks/01/sample_test.clj">примерния тест</a></strong>. Целта му е да провери, че системата ни за
проверка се справя с вашето решение. Ако има грешка при неговото изпълнение,
ще има грешка и при проверката, в резултат на което е вероятно да имате 0
точки.</li>
<li>За да пуснете <a href="https://github.com/fmi/clojure-homework/blob/master/tasks/01/sample_test.clj">примерния тест</a> , просто добавете файл
<code>solution.clj</code> в директорията на домашното, влезте в нея и изпълнете:<br><code>$ clj sample_test.clj</code><br>
...където <code>clj</code> е изпълнимото име на Clojure на вашата машина. Обърнете
внимание, че в текущата директория трябва да има <code>sample_test.clj</code> и
<code>solution.clj</code>.</li>
<li>Дефинирайте всички функции, дори да не можете да решите цялата задача. В
такъв случай, функцията ви е добре да връща <code>nil</code>. Може направо да започнете
с <a href="http://github.com/fmi/clojure-homework/blob/master/tasks/01/template.clj">нашия шаблон</a>.</li>
<li>Не връщайте константи стойности, с цел да отгатнете с какво тестваме
решенията ви. Преглеждаме всяко решение – в случай, че отгатнете успешно, ще
ви вземем голям брой точки за да ви обезсърчим от подобни опити.</li>
<li>
<strong>Придържайте се стриктно към <a href="https://github.com/bbatsov/clojure-style-guide">ръководството за стил</a>!</strong> В бъдещите
задачи ще отнемаме точки за неспазване на стилистичните норми наложени от
гореспоменатото ръководство. Ще е напълно в реда на нещата да получите 0 точки
за напълно работеща задача, поради неспазване на конвенциите. Така че по-добре
започнете и свикнете от сега ;)</li>
</ul></article>
  </div>

  </div>
</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" class="js-jump-to-line-form">
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="button">Go</button>
  </form>
</div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer">
    <ul class="site-footer-links right">
      <li><a href="https://status.github.com/">Status</a></li>
      <li><a href="http://developer.github.com">API</a></li>
      <li><a href="http://training.github.com">Training</a></li>
      <li><a href="http://shop.github.com">Shop</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="/about">About</a></li>

    </ul>

    <a href="/">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
    </a>

    <ul class="site-footer-links">
      <li>&copy; 2014 <span title="0.12446s from github-fe121-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="/site/terms">Terms</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
        <li><a href="/contact">Contact</a></li>
    </ul>
  </div><!-- /.site-footer -->
</div><!-- /.container -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-remove-close close js-ajax-error-dismiss"></a>
      Something went wrong with that request. Please try again.
    </div>

  </body>
</html>

