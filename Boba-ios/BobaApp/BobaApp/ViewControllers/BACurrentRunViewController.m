//
//  BACurrentRunViewController.m
//  BobaApp
//
//  Created by Hyun Bin Kim on 2014-10-04.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import "BACurrentRunViewController.h"
#import "Helpers.h"

@class BARunDetailViewController, BACurrentRunTableViewCell;

@implementation BACurrentRunViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    self.currentRunTableView.delegate = self;
    self.currentRunTableView.dataSource = self;
}

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
    NSString *const kCurrentRunTableViewCellId = @"CurrentRunTableViewCell";
    BACurrentRunTableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:kCurrentRunTableViewCellId];
    
    return (UITableViewCell *)cell;
}

- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
    return 1;
}

@end
