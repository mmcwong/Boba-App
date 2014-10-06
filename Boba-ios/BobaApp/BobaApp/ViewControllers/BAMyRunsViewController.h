//
//  BAMyRunViewController.h
//  BobaApp
//
//  Created by Hyun Bin Kim on 2014-10-04.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface BAMyRunsViewController : UIViewController <UITableViewDelegate, UITableViewDataSource>

@property (weak, nonatomic) IBOutlet UITableView *myRunsTableView;
@property (weak, nonatomic) IBOutlet UIButton *startRunButton;

@end
